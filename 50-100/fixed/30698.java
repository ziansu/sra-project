public tubes.kelas getKelas(java.lang.String kelas) {
    for (int i = 1; i <= (this.listKelas); i++) {
        if ((this.daftarkelas[i].getNamaKelas()) == kelas) {
            return this.daftarkelas[i];
        }
    }
    return ;
}