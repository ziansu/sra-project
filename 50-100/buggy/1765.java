@java.lang.Override
public void onClick(android.view.View v) {
    if (check) {
        check = false;
        list.get(pos).check = false;
        holder.check.setImageResource(R.drawable.no_alarm);
        releaseAlarm(list.get(pos));
    }else {
        check = true;
        list.get(pos).check = true;
        holder.check.setImageResource(R.drawable.do_alarm);
        setAlarm(list.get(pos));
    }
    writeAlarm();
}