@java.lang.Override
public void setup(hashJoin.Context context) {
    org.apache.hadoop.conf.Configuration conf = context.getConfiguration();
    delim = conf.get("delimiter");
    hashJoin.MRHashJoin.HashJoinReducer.hmap = com.google.common.collect.HashMultimap.create();
}