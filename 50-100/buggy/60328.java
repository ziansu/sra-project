@java.lang.Override
public void onBindViewHolder(com.dangerducks.cookit.utils.StepAdapter.StepHolder holder, int position) {
    android.util.Log.v("Adapter", ((("Step " + position) + " descrip: ") + (steps.elementAt(position).getDescription())));
    holder.stepDescription.setText(steps.elementAt(position).getDescription());
    holder.stepDuration.setText(((steps.elementAt(position).getTime()) + " minutes"));
    holder.stepNumber.setText(("Step " + (position + 1)));
}