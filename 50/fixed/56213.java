protected BucketMapReduce.Builder addReducePaging(com.basho.riak.client.api.commands.mapreduce.BucketMapReduce.Builder builder, java.lang.Integer take, java.lang.Integer skip) {
    return addReducePaging(builder, true, take, skip);
}