public boolean register(java.lang.String username, java.lang.String password, java.lang.String email) throws java.lang.Exception {
    java.lang.String code = zhao_ren_db.Hash.encode(username, password);
    java.lang.String sql = java.lang.String.format("INSERT INTO user(username,password,email,avatar,status) VALUES (\"%s\",\"%s\",\"%s\",concat((floor(rand()*8)+1),\'.jpg\'),\"%d\")", username, code, email, 1);
    java.lang.System.out.println(sql);
    return (update(sql)) == 1;
}