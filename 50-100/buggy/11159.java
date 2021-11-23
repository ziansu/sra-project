@java.lang.Override
public org.boxfox.dms.utilities.json.EasyJsonObject action(org.boxfox.dms.utilities.actions.support.Sender sender, int command, org.boxfox.dms.utilities.json.EasyJsonObject requestObject) throws java.sql.SQLException {
    java.lang.String title = requestObject.getString("title");
    java.lang.String content = requestObject.getString("question_content");
    java.lang.String writer = requestObject.getString("writer");
    int privacy = requestObject.getInt("privacy");
    int status = database.executeUpdate("INSERT INTO qna(title, question_content, question_date, writer, privacy) VALUES('", title, "', '", content, "', now(), '", writer, "', ", privacy, ")");
    responseObject.put("status", status);
    return responseObject;
}