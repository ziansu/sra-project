@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.records_layout, container, false);
    imageView = ((android.widget.ImageView) (v.findViewById(R.id.league_records_logo)));
    textView = ((android.widget.TextView) (v.findViewById(R.id.league_records_text)));
    return v;
}