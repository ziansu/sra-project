@java.lang.Override
protected void map(org.apache.hadoop.io.LongWritable key, org.apache.hadoop.io.Text value, sortflights.Context context) throws java.io.IOException, java.lang.InterruptedException {
    sortflights.DataFlightsInput flight = new sortflights.DataFlightsInput(value.toString());
    if ((flight.isCancelled()) || ((flight.getArrDelay()) < 0))
        context.write(flight, value);
    
}