@java.lang.Override
public void onClick(android.view.View v) {
    switch (com.example.user.encapsulate.SearchFragment.originator) {
        case "PF" :
            mListener.backTo(2);
            break;
        case "VF" :
            mListener.backTo(4);
            break;
        case "WF" :
            mListener.backTo(3);
            break;
    }
}