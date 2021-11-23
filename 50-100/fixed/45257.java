private void mineResource(Game.Resource resource) {
    if (((resource.getAmount()) - (mineAmount)) > 0) {
        resource.setAmount(((resource.getAmount()) - (mineAmount)));
        amountResource = (amountResource) + (mineAmount);
    }else
        if ((resource.getAmount()) > 0) {
            amountResource = (amountResource) + (resource.getAmount());
        }
    
}