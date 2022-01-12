@java.lang.Override
public android.support.v4.app.Fragment getItem(int pos) {
    switch (pos) {
        default :
            {
                c.add(java.util.Calendar.DATE, (pos - (lastpos)));
                android.os.Bundle b = new android.os.Bundle();
                b.putLong("Date", c.getTimeInMillis());
                b.putString("gymID", gymID);
                b.putString("nameID", nameID);
                lastpos = pos;
                return one.dichmann.lectioapp.Fragments.DayFragment.newInstance(b);
            }
    }
}