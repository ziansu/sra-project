public void map(org.apache.hadoop.io.Text key, org.apache.hadoop.io.Text value, cloudCompu.PageRankMr.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String[] detial = value.toString().split("&gt;");
    java.lang.String[] par = detial[0].split(" ");
    if ((java.lang.Integer.parseInt(par[2])) == 0) {
        title.set("Sum");
        pr.set(java.lang.Double.parseDouble(par[0]));
        context.write(title, pr);
    }
}