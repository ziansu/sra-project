public void setFinishedSqFt(java.lang.String finishedSqFtString) {
    if ((finishedSqFtString.length()) > 9) {
        throw new java.lang.IllegalArgumentException(("Argument finishedSqFt cannot be longer than 9 characters. Argument given: " + (finishedSqFt)));
    }else
        if ((finishedSqFtString.length()) > 0) {
            int sqFt = java.lang.Integer.parseInt(finishedSqFtString);
            if (sqFt < 0) {
                throw new java.lang.IllegalArgumentException(("Finished sq ft cannot be negative. Invalid value given: " + (finishedSqFt)));
            }else {
                this.finishedSqFt = sqFt;
            }
        }
    
}