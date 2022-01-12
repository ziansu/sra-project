@java.lang.Override
protected java.lang.Integer doInBackground(java.lang.Object... params) {
    calendar = new java.util.GregorianCalendar();
    start_time = calendar.getTime();
    java.lang.Integer result = this.compute_scores(base_played, ((java.lang.Integer) (params[1])), (((java.lang.Integer) (params[2])) - 1), (((java.lang.Integer) (params[3])) - 1), 0);
    return result;
}