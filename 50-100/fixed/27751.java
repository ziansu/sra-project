@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            com.example.eduardo.gshell.TabFragment1 tab1 = new com.example.eduardo.gshell.TabFragment1(this.server);
            return tab1;
        case 1 :
            com.example.eduardo.gshell.TabFragment2 tab2 = new com.example.eduardo.gshell.TabFragment2(this.server);
            return tab2;
        case 2 :
            com.example.eduardo.gshell.TabFragment3 tab3 = new com.example.eduardo.gshell.TabFragment3();
            return tab3;
        default :
            return null;
    }
}