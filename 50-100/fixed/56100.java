@java.lang.Override
public void onClick(android.view.View v) {
    if (((com.example.shivanshu.alumniconnect.AlumniDetailFragment.CheckedEnteryError) == (VALIDDATA)) || ((com.example.shivanshu.alumniconnect.AlumniDetailFragment.CheckedEnteryError) == 0)) {
        if ((i) != 0) {
            android.util.Log.d("digvijay", "Data is valid");
            if ((mListener) != null) {
                mListener.onAlumniDetailInteraction(s);
            }
        }
    }else {
        android.util.Log.d("digvijay", "Data is not valid");
    }
}