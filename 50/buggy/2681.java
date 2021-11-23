public void accessDatabase() {
    seanmkelley.callout.DbMailer.JsonReadTask task = new seanmkelley.callout.DbMailer.JsonReadTask();
    task.execute(new java.lang.String[]{ url });
}