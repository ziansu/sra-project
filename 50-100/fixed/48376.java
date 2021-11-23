@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    switch (position) {
        case 0 :
            startActivity(new android.content.Intent(context, de.prismatikremote.hartz.prismatikremote.MainActivity.class));
            break;
        case 1 :
            startActivity(new android.content.Intent(context, de.prismatikremote.hartz.prismatikremote.Profiles.class));
            break;
        case 3 :
            startActivity(new android.content.Intent(context, de.prismatikremote.hartz.prismatikremote.Console.class));
            break;
    }
}