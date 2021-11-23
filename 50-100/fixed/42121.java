public static void showSelected(android.content.Context ctx, int[] ids, java.util.Date start, java.util.Date end) {
    if ((com.example.djordje.seeds.device.Device.context) == null)
        com.example.djordje.seeds.device.Device.context = ctx;
    
    com.example.djordje.seeds.device.Device.RetrieveWithValuesTask r = new com.example.djordje.seeds.device.Device.RetrieveWithValuesTask(ids, start, end, ctx);
    r.execute();
}