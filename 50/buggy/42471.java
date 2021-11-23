public void addGudang(int id) {
    if ((jumGudang) < 10) {
        daftarGudang.add(new inventaris.Gudang(id));
        jumGudang = daftarGudang.size();
    }
}