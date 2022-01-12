@java.lang.Override
public void onClick(android.view.View v) {
    if ((holder.projectOverview.getVisibility()) == (android.view.View.GONE)) {
        holder.showOverview.setImageResource(R.drawable.project_list_arrow_up);
        holder.projectDetails.setVisibility(View.GONE);
        holder.projectName.setSingleLine(true);
        setProjectOverview(projectName, holder);
    }else {
        holder.showOverview.setImageResource(R.drawable.project_list_arrow_down);
        holder.projectOverview.setVisibility(View.GONE);
        if (showDetails) {
            holder.projectDetails.setVisibility(View.VISIBLE);
            holder.projectName.setSingleLine(false);
        }
    }
}