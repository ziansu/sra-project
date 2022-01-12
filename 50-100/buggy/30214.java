@java.lang.Override
public android.support.v4.app.Fragment getItem(int pos) {
    switch (pos) {
        default :
            {
                java.lang.System.out.println(c.get(java.util.Calendar.DAY_OF_YEAR));
                c.add(java.util.Calendar.WEEK_OF_YEAR, (pos - (lastpos)));
                android.os.Bundle b = new android.os.Bundle();
                b.putLong("Date", c.getTimeInMillis());
                b.putString("gymID", gymID);
                b.putString("nameID", nameID);
                lastpos = pos;
                return one.dichmann.lectioapp.Fragments.WeekFragment.newInstance(b);
            }
    }
}