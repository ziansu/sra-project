@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    if (convertView == null) {
        convertView = android.view.LayoutInflater.from(mContext).inflate(R.layout.problem_list_item, null);
    }
    joey.com.leetroid.Problem problem = joey.com.leetroid.ProblemsContainer.getInstance().getProblem(position);
    java.lang.System.out.println(((("Position " + position) + " Title ") + (problem.mTitle)));
    ((joey.com.leetroid.ProblemListItemView) (convertView)).setProblemAttributes(problem);
    return convertView;
}