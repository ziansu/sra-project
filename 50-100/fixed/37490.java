private static void initDatabase() {
    vn.com.solution.ntq.glastool.dao.DatabaseAccess.USER_DATABASE = vn.com.solution.ntq.glastool.dao.DatabaseAccess.MONGO_CLIENT.getDatabase(Constant.DB.userdb.name());
    vn.com.solution.ntq.glastool.dao.DatabaseAccess.MOCKUP_DATABASE = vn.com.solution.ntq.glastool.dao.DatabaseAccess.MONGO_CLIENT.getDatabase(Constant.DB.mockup.name());
    vn.com.solution.ntq.glastool.dao.DatabaseAccess.CHATLOG_DATABASE = vn.com.solution.ntq.glastool.dao.DatabaseAccess.MONGO_CLIENT.getDatabase(Constant.DB.chatlog.name());
    vn.com.solution.ntq.glastool.dao.DatabaseAccess.CHATLOGEXTENSION_DATABASE = vn.com.solution.ntq.glastool.dao.DatabaseAccess.MONGO_CLIENT.getDatabase(Constant.DB.chatlogextension.name());
    vn.com.solution.ntq.glastool.dao.DatabaseAccess.CHATLOGEXTENSION2_DATABASE = vn.com.solution.ntq.glastool.dao.DatabaseAccess.MONGO_CLIENT.getDatabase(Constant.DB.chatlogextension2.name());
    vn.com.solution.ntq.glastool.dao.DatabaseAccess.CHATLOGEXTENSION3_DATABASE = vn.com.solution.ntq.glastool.dao.DatabaseAccess.MONGO_CLIENT.getDatabase(Constant.DB.chatlogextension3.name());
}