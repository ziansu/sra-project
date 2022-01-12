private void showOpen311ProblemFragment(edu.usf.cutr.open311client.models.Service service) {
    org.onebusaway.android.report.ui.Open311ProblemFragment.show(this, R.id.ri_report_stop_problem, mOpen311, service);
}