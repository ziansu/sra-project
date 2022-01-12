public void map(org.apache.hadoop.io.Text key, org.apache.hadoop.io.Text value, cloudCompu.PageRankMr.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String[] detial = value.toString().split("&gt;");
    java.lang.String[] par = detial[0].split(" ");
    title.set(((key + "&gt;") + (par[0])));
    pr.set(value);
    context.write(title, pr);
}