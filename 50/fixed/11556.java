@java.lang.Override
public void run() {
    adapter = new edu.ucsb.cs.cs185.afarcilla.senioritis.RecycleAdapter(myDataset);
    c.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            recyclerView.setAdapter(adapter);
        }
    });
}