@java.lang.Override
public java.lang.String create(spark.Request req, spark.Response res) {
    java.lang.String username = req.queryParams("username");
    java.lang.String hash = req.queryParams("password");
    java.lang.String id = db.query("select id from users where username = ? and password_hash = ?", username, hash).get(0).get("id");
    java.lang.String token = io.github.brunovcosta.quillbill.helpers.HashHelper.hash();
    db.update("insert into authentications(token,user_id) values (?,?)", token, id);
    return token;
}