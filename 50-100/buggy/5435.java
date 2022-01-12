@java.lang.Override
public com.scrawlsoft.gjournal.MainActivity.TheViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    java.lang.System.out.println(("VT: " + viewType));
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
    android.widget.TextView textView = ((android.widget.TextView) (view.findViewById(android.R.id.text1)));
    return new com.scrawlsoft.gjournal.MainActivity.TheViewHolder(view, textView);
}