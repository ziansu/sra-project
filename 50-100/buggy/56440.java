public SupervisedLearner getLearner(java.lang.String model, java.util.Random rand) throws java.lang.Exception {
    if (model.equals("baseline"))
        return new BaselineLearner();
    else
        if (model.equals("perceptron"))
            return new Perceptron(rand);
        else
            if (model.equals("neuralnet"))
                return new NeuralNet(rand);
            else
                if (model.equals("decisiontree"))
                    return new DecisionTree();
                else
                    throw new java.lang.Exception(("Unrecognized model: " + model));
                
            
        
    
}