@java.lang.Override
public void initDefaultUser() {
    if ((readData(corp.skaj.foretagskvitton.services.DataHandler.USER_KEY, corp.skaj.foretagskvitton.services.DataHandler.classOfUser)) == null) {
        corp.skaj.foretagskvitton.model.User user = new corp.skaj.foretagskvitton.model.User("DEFAULT USER");
        corp.skaj.foretagskvitton.model.Company company = new corp.skaj.foretagskvitton.model.Company("DEFAULT COMPANY");
        company.addEmployee(new corp.skaj.foretagskvitton.model.Employee(user.getName()));
        user.addCompany(company);
        writeData(corp.skaj.foretagskvitton.services.DataHandler.USER_KEY, user);
    }
}