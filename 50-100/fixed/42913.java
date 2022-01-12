protected static com.mongodb.client.MongoDatabase getDB(vn.com.solution.ntq.glastool.utils.Constant.DB db) {
    com.mongodb.client.MongoDatabase database;
    switch (db) {
        case chatlog :
            database = vn.com.solution.ntq.glastool.dao.DatabaseAccess.CHATLOG_DATABASE;
            break;
        case chatlogextension :
            database = vn.com.solution.ntq.glastool.dao.DatabaseAccess.CHATLOGEXTENSION_DATABASE;
            break;
        case chatlogextension2 :
            database = vn.com.solution.ntq.glastool.dao.DatabaseAccess.CHATLOGEXTENSION2_DATABASE;
            break;
        case chatlogextension3 :
            database = vn.com.solution.ntq.glastool.dao.DatabaseAccess.CHATLOGEXTENSION3_DATABASE;
            break;
        case userdb :
        default :
            database = vn.com.solution.ntq.glastool.dao.DatabaseAccess.USER_DATABASE;
    }
    return database;
}