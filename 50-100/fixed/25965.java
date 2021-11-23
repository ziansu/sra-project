public static void deleteFlagFromServer(ch.ethz.inf.vs.a4.funwithflags.Flag f) {
    com.parse.ParseQuery<com.parse.ParseObject> flagQuery = new com.parse.ParseQuery<com.parse.ParseObject>("Flag");
    flagQuery.getInBackground(f.getID(), new com.parse.GetCallback<com.parse.ParseObject>() {
        @java.lang.Override
        public void done(com.parse.ParseObject object, com.parse.ParseException e) {
            try {
                object.delete();
            } catch (ch.ethz.inf.vs.a4.funwithflags.com.parse e1) {
                e1.printStackTrace();
            }
        }
    });
}