public double getDiscount(int milage) {
    if (milage < (com.epam.oop.homework.passenger.fflevel.FrequentFlyer.NOPEFFMAX)) {
        return 1;
    }else
        if ((milage > (com.epam.oop.homework.passenger.fflevel.FrequentFlyer.NOPEFFMAX)) && (milage < (com.epam.oop.homework.passenger.fflevel.FrequentFlyer.BRONZEFFMAX))) {
            return 0.9;
        }else
            if ((milage > (com.epam.oop.homework.passenger.fflevel.FrequentFlyer.BRONZEFFMAX)) && (milage < (com.epam.oop.homework.passenger.fflevel.FrequentFlyer.GOLDFFMAX))) {
                return 0.6;
            }else {
                return 0.3;
            }
        
    
}