private boolean isCurrPosition(float childY, android.view.View itemView) {
    return (childY >= (itemView.getTop())) && (childY <= (itemView.getBottom()));
}