@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    if (convertView == null) {
        joey.com.leetroid.ProblemListItemView view = ((joey.com.leetroid.ProblemListItemView) (android.view.LayoutInflater.from(mContext).inflate(R.layout.problem_list_item, null)));
        joey.com.leetroid.Problem problem = joey.com.leetroid.ProblemsContainer.getInstance().getProblem(position);
        view.setProblemAttributes(problem);
        java.lang.System.out.println(((("Position " + position) + " Title ") + (problem.mTitle)));
        return view;
    }else {
        return convertView;
    }
}