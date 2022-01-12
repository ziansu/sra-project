@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    if (convertView == null) {
        convertView = inflater.inflate(pl.edu.uj.andriod.Zaliczenie.R.layout.task, null);
    }
    pl.edu.uj.andriod.Zaliczenie.ui.TaskView taskView = new pl.edu.uj.andriod.Zaliczenie.ui.TaskView(convertView, getContext());
    taskView.fillInData(getItem(position));
    return convertView;
}