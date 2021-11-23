@java.lang.Override
public void onClick(com.eemc.aida.DialogInterface p1, int p2) {
    setCardView(0);
    symad.showing.clear();
    for (int i = 0; i < (symnum); ++i) {
        if (syms.get(i).demangledname.contains(kw.getText().toString())) {
            symad.showing.add(i);
        }
    }
    symad.notifyDataSetChanged();
}