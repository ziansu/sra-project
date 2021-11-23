@java.lang.Override
public android.view.View getView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup) {
    root = inflater.inflate(R.layout.rotation_overlap_header, viewGroup, true);
    progress = ((android.widget.ProgressBar) (root.findViewById(R.id.progress)));
    if ((rotationSrc) != 0) {
        progress.setIndeterminateDrawable(android.support.v4.content.ContextCompat.getDrawable(context, rotationSrc));
    }
    progress.setVisibility(View.INVISIBLE);
    return root;
}