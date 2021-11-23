private void initlst() {
    if ((tbl.findViewById(R.id.operator)) != null) {
        tbl.findViewById(R.id.operator).setOnClickListener(this);
        tbl.findViewById(R.id.filename).setOnClickListener(this);
    }
}