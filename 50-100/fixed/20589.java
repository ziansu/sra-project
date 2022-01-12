public static void main(java.lang.String[] args) {
    try {
        edu.umass.ckc.wo.db.DbPedagogy p = new edu.umass.ckc.wo.db.DbPedagogy();
        edu.umass.ckc.wo.db.DbPedagogy.buildMapOfOldIds = true;
        edu.umass.ckc.wo.db.DbPedagogy.conn = edu.umass.ckc.wo.db.DbUtil.getAConnection("localhost");
        edu.umass.ckc.wo.tutor.Settings.lessonMap = edu.umass.ckc.wo.db.DbPedagogy.buildAllLessons(edu.umass.ckc.wo.db.DbPedagogy.conn);
        edu.umass.ckc.wo.tutor.Settings.loginMap = edu.umass.ckc.wo.db.DbPedagogy.buildAllLoginSequences(edu.umass.ckc.wo.db.DbPedagogy.conn);
        edu.umass.ckc.wo.tutor.Settings.pedagogyGroups = edu.umass.ckc.wo.db.DbPedagogy.buildAllPedagogies(edu.umass.ckc.wo.db.DbPedagogy.conn);
        edu.umass.ckc.wo.db.DbPedagogy.adjustClassPedagogies(edu.umass.ckc.wo.db.DbPedagogy.conn);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}