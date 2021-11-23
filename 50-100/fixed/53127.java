public void setIconExpand(android.content.Context context) {
    if (context != null) {
        if (expanded) {
            iconExpand.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_navigation_expand_less));
            txtDescription.setVisibility(View.VISIBLE);
        }else {
            iconExpand.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_navigation_expand_more));
            txtDescription.setVisibility(View.GONE);
        }
    }
}