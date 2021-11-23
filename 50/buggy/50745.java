private void notifyLabDetailsAdapter() {
    progressDialog.dismiss();
    objectArrayList.clear();
    objectArrayList.addAll(org.wizbots.labtab.database.ProgramStudentsTable.getInstance().getStudentsListByProgramId(programOrLab.getId()));
    labDetailsAdapter.notifyDataSetChanged();
}