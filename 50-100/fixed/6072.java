private void checkYesOrNo(int i) {
    if (yes_chk.get(i).toString().equals("yes")) {
        y.setChecked(true);
    }else
        if (no_chk.get(i).toString().equals("no")) {
            n.setChecked(true);
        }else {
            y.setChecked(false);
            n.setChecked(false);
        }
    
}