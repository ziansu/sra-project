private boolean validatePassword(int oprID, java.lang.String pass) throws cdio3.shared.DALException {
    if (testing) {
        cdio3.shared.OperatoerDTO oprDTO = new cdio3.shared.OperatoerDTO(testingDAO.getOperatoer(oprID));
        if ((oprDTO.getPassword()) == pass) {
            return true;
        }else {
            return false;
        }
    }else {
        cdio3.shared.OperatoerDTO oprDTO = new cdio3.shared.OperatoerDTO(oprDAO.getOperatoer(oprID));
        if ((oprDTO.getPassword()) == pass) {
            return true;
        }else {
            return false;
        }
    }
}