public int getNurseCost() {
    int nurseCost = 0;
    if ((nurseType) == 'X')
        nurseCost = 0;
    else
        if ((nurseType) == 'N')
            nurseCost = (HospitalMVC.Patient.privateNurseRate) * (days);
        else
            nurseCost = (HospitalMVC.Patient.semiPrivateNurseRate) * (days);
        
    
    return nurseCost;
}