@java.lang.Override
public void done(java.util.List<reli.reliapp.co.il.reli.dataStructures.Discussion> li, com.parse.ParseException e) {
    dia.dismiss();
    ((android.widget.TextView) (bla.findViewById(textId))).setText(java.lang.Integer.toString(li.size()));
}