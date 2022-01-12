private void setDefaultEdgeOption(org.grandviewtech.userinterface.screen.ColumnScreen columnScreen) {
    org.grandviewtech.entity.enums.Edge edge = columnScreen.getEdge();
    if (edge != null)
        switch (edge) {
            case FALLING :
                {
                    risingEdge.setSelected(false);
                    fallingEdge.setSelected(true);
                    break;
                }
            case RISING :
                {
                    risingEdge.setSelected(true);
                    fallingEdge.setSelected(false);
                    break;
                }
        }
    
}