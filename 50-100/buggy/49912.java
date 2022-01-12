public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.buttonAddAssingment :
            double pointsAchievedDouble = java.lang.Double.parseDouble(pointsAchieved.getText().toString());
            double maxPointsDouble = java.lang.Double.parseDouble(maxPoints.getText().toString());
            com.example.gradegrubber.Assignment newAssignment = new com.example.gradegrubber.Assignment(addAssingmentName.getText().toString(), pointsAchievedDouble, maxPointsDouble);
            course1.addAssignment(newAssignment);
    }
}