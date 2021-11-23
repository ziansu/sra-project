@java.lang.Override
public void onMenuSelected(int index) {
    switch (index) {
        case 0 :
            shareRando(holder);
            break;
        case 1 :
            reportRando(holder);
            break;
        case 2 :
            deleteRando(holder);
            break;
        default :
            break;
    }
}