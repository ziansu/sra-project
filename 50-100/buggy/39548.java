public java.util.List<com.example.huynhthanhnha.myapplication.form.Bill> getListBill() {
    java.util.List<com.example.huynhthanhnha.myapplication.form.Bill> listBill = new java.util.ArrayList<com.example.huynhthanhnha.myapplication.form.Bill>();
    com.db4o.ObjectSet<com.example.huynhthanhnha.myapplication.form.Bill> results = db.query(new com.db4o.query.Predicate<com.example.huynhthanhnha.myapplication.form.Bill>() {
        @java.lang.Override
        public boolean match(com.example.huynhthanhnha.myapplication.form.Bill bill) {
            return (bill.isState()) == false;
        }
    });
    for (com.example.huynhthanhnha.myapplication.form.Bill b : results) {
        listBill.add(b);
    }
    return listBill;
}