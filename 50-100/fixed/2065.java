public void setState(com.nekretnine.models.Advertisement.State state) {
    if (state == (Advertisement.State.OPEN)) {
        this.state = com.nekretnine.dto.AdvertisementDTO.State.OPEN;
    }else
        if (state == (Advertisement.State.EXPIRED)) {
            this.state = com.nekretnine.dto.AdvertisementDTO.State.EXPIRED;
        }else
            if (state == (Advertisement.State.REPORTED)) {
                this.state = com.nekretnine.dto.AdvertisementDTO.State.REPORTED;
            }else
                if (state == (Advertisement.State.REMOVED)) {
                    this.state = com.nekretnine.dto.AdvertisementDTO.State.REMOVED;
                }else {
                    this.state = com.nekretnine.dto.AdvertisementDTO.State.SOLD;
                }
            
        
    
}