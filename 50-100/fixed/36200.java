@java.lang.Override
public void onDestroy() {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.JELLY_BEAN_MR1)) {
        if (!(getActivity().isFinishing())) {
            android.app.Fragment subfragment = getFragmentManager().findFragmentById(R.id.subfragment_container);
            if (subfragment != null) {
                android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
                try {
                    transaction.remove(subfragment);
                } finally {
                    transaction.commitAllowingStateLoss();
                }
            }
        }
    }
    super.onDestroy();
}