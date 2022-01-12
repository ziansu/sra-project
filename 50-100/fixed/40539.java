protected void selectedNext() {
    if ((com.thud.thpt_dh.utils.interfaces.Flags.loai_dethi) == false) {
        com.thud.thpt_dh.utils.interfaces.Flags.vitri_cauhoi += 1;
        vitri_cauhoi += 1;
        group_rad_dapan.clearCheck();
        setValue();
        setData();
    }else {
        com.thud.thpt_dh.utils.interfaces.Flags.vitri_cauhoi += 1;
        vitri_cauhoi += 1;
        setValue();
        setData();
    }
}