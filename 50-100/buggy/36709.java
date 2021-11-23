private void readAudioPointNames(java.lang.String excursionName) {
    if (excursionName.equals("Demo")) {
        deserializeAudioPointNames(R.raw.demo_point_names);
    }else
        if (excursionName.equals("Gamlastan")) {
            deserializeAudioPointNames(R.raw.gamlastan_point_names);
        }else
            if (excursionName.equals("Abrahamsberg")) {
                deserializeAudioPointNames(R.raw.abrahamsberg_point_names);
            }else {
                throw new java.lang.IllegalArgumentException("Unsupported excursion");
            }
        
    
}