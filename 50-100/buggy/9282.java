public void map(java.lang.Object key, org.apache.hadoop.io.Text value, nl.utwente.bigdata.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String[] split = value.toString().split("\t+");
    nl.utwente.bigdata.GoalPlayerCount.CountMapper.player.set(split[1]);
    context.write(nl.utwente.bigdata.GoalPlayerCount.CountMapper.player, nl.utwente.bigdata.GoalPlayerCount.CountMapper.one);
}