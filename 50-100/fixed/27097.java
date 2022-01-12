public int getNurseCost() {
    int nurseCost = 0;
    switch (nurseType) {
        case 'X' :
            nurseCost = 0;
            break;
        case 'N' :
            nurseCost = (HospitalMVC.Patient.privateNurseRate) * (days);
            break;
        default :
            nurseCost = (HospitalMVC.Patient.semiPrivateNurseRate) * (days);
            break;
    }
    return nurseCost;
}